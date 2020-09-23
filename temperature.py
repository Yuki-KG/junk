import numpy as np
import matplotlib.pyplot as plt

celc = np.arange(-50, 50, 0.1)
fahr = celc * 9/5 + 32
y = celc

fig = plt.figure()
ax = fig.add_subplot(111)
ax.set_xticks(np.arange(-50, 60, 10))
ax.set_yticks(np.arange(-50, 110, 10))
ax.grid(which = "major", alpha = 0.8, linestyle = "--")
plt.plot(celc, fahr, label="Fahrenheit")
plt.plot(celc, y, linestyle = "--", label="Celcius")
plt.xlabel('Celcius')
plt.ylabel('Degrees')
plt.legend()
plt.show()
