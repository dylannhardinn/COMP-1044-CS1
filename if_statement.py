# Calculate and display each employee's gross pay.
# The first 40 hours are paid at the regular rate.
# Hours 41-60 are paid at 1.5 times the regular rate.
# Hours over 60 are paid at 2 times the regular rate.

for name, rate, hours in zip(employee_names, pay_rates, hours_worked):

    if hours <= 40:
        # All hours are paid at the regular rate.
        pay = hours * rate

    elif hours <= 60:
        # The first 40 hours are regular pay.
        # Any hours above 40 are paid at time-and-a-half.
        regular_pay = 40 * rate
        overtime_pay = (hours - 40) * rate * 1.5
        pay = regular_pay + overtime_pay

    else:
        # The first 40 hours are regular pay.
        # Hours 41-60 are paid at time-and-a-half.
        # Hours over 60 are paid at double time.
        regular_pay = 40 * rate
        overtime_pay = 20 * rate * 1.5
        double_time_pay = (hours - 60) * rate * 2
        pay = regular_pay + overtime_pay + double_time_pay

    # Display the employee's name and pay with two decimal places.
    print(f"{name} is paid ${pay:.2f}")
