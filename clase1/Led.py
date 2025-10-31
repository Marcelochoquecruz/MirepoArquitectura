# Importar las librerías necesarias
from machine import Pin
from time import sleep

# Configurar el LED en el pin 26 como un pin de salida
led = machine.Pin(26, machine.Pin.OUT)

# Iniciar un bucle infinito
while True:
    # Encender el LED estableciendo su valor en 1 (ALTO)
    led.value(1)
    # Esperar 1 segundo (1000 milisegundos) mientras el LED está encendido
    time.sleep(1)

    # Apagar el LED estableciendo su valor en 0 (BAJO)
    led.value(0)
    # Esperar 0.5 segundos (500 milisegundos) mientras el LED está apagado
    time.sleep(0.5)