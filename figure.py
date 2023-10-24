import pandas as pd
import matplotlib.pyplot as plt

# Assuming the data is loaded into a pandas DataFrame named 'data'
data = pd.read_csv(
    '/Users/wenjiexu/Desktop/visualization/college_wage_premium.csv')

# Using the structure of the data:
fig, ax = plt.subplots(figsize=(15, 8))

# Plotting for High School education level
ax.plot(data['year'], data['high_school'], marker='o',
        label='High School (Total)', color='blue', linestyle='-')
ax.plot(data['year'], data['men_high_school'], marker='o',
        label='High School (Men)', color='blue', linestyle='--')
ax.plot(data['year'], data['women_high_school'], marker='o',
        label='High School (Women)', color='blue', linestyle=':')

# Plotting for Bachelors Degree education level
ax.plot(data['year'], data['bachelors_degree'], marker='o',
        label='Bachelors Degree (Total)', color='green', linestyle='-')
ax.plot(data['year'], data['men_bachelors_degree'], marker='o',
        label='Bachelors Degree (Men)', color='green', linestyle='--')
ax.plot(data['year'], data['women_bachelors_degree'], marker='o',
        label='Bachelors Degree (Women)', color='green', linestyle=':')

# Setting labels, title, and legend
ax.set_xlabel('Year')
ax.set_ylabel('Average Wage ($)')
ax.set_title('Wage Trends by Education Level and Gender (1973-2022)')
ax.legend(loc='upper left')
ax.grid(True, which='both', linestyle='--', linewidth=0.5)

plt.xticks(rotation=45)  # Rotating the x-axis year labels for clarity
plt.tight_layout()
plt.show()
