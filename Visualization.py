import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import matplotlib.ticker as mtick
import matplotlib.colors as mcolors

# Load the dataset
file_path = 'hotel_bookings.csv'  # Replace with the path to your file
data = pd.read_csv(file_path)

# Cancellation Rate by Month

# Convert the month to a datetime object for sorting
data['arrival_date_month'] = pd.to_datetime(
    data['arrival_date_month'], format='%B').dt.month

# Group by month and calculate the cancellation rate
cancellation_rate_by_month = data.groupby('arrival_date_month')[
    'is_canceled'].mean()

# Convert the index back to month names
cancellation_rate_by_month.index = pd.to_datetime(
    cancellation_rate_by_month.index, format='%m').month_name()

# Enhanced color palette for the bar chart (Cancellation Rate by Month)
distinct_colors = list(mcolors.TABLEAU_COLORS.values())


colors_for_each_bar_distinct = sns.color_palette(
    "Set3", len(cancellation_rate_by_month))

# Plotting Cancellation Rate by Month with distinct and moderately saturated colors
plt.figure(figsize=(10, 6))
sns.barplot(x=cancellation_rate_by_month.index,
            y=cancellation_rate_by_month.values * 100, palette=colors_for_each_bar_distinct)
plt.title('Cancellation Rate by Month', fontsize=16)
plt.xlabel('Month', fontsize=12)
plt.ylabel('Cancellation Rate (%)', fontsize=12)
plt.xticks(rotation=45)
plt.gca().yaxis.set_major_formatter(mtick.PercentFormatter())
plt.grid(axis='y', linestyle='--')
plt.tight_layout()

# Average Daily Rate (ADR) by Room Type

# Group by room type and arrival date month, then calculate the average daily rate
adr_by_room_month = data.groupby(['reserved_room_type', 'arrival_date_month'])[
    'adr'].mean().unstack()

# Enhanced line plot for ADR by Room Type with distinct solid lines
plt.figure(figsize=(12, 8))
sns.lineplot(data=adr_by_room_month.T, palette=distinct_colors, linewidth=2.5)
plt.title('Average Daily Rate (ADR) by Room Type', fontsize=16)
plt.xlabel('Month', fontsize=12)
plt.ylabel('Average Daily Rate', fontsize=12)
plt.xticks(range(12), pd.date_range(
    '2023-01-01', periods=12, freq='M').strftime('%B'), rotation=45)
plt.legend(title='Room Type', fontsize=10)
plt.grid(axis='y', linestyle='--')
plt.tight_layout()

plt.show()
