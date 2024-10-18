# Basso_SantiagoPParcial
repositorio primer parcial

# 🏨 Sistema de Servicios de Hospedaje y Gastronomía

---

## Alumno
**Nombre del alumno**: [Basso Santiago]

## 📄 Descripción del Proyecto

Este proyecto es un sistema de gestión diseñado para servicios de hospedaje y gastronomía, implementando conceptos de Programación Orientada a Objetos (POO) en Java. El objetivo es crear una aplicación que permita gestionar estos servicios, calcular precios finales con promociones, y validar atributos mediante excepciones cuando sea necesario.

### Objetivos
- Implementar un modelo orientado a objetos que refleje la gestión de servicios de hospedaje y gastronomía.
- Aplicar promociones y descuentos de forma dinámica.
- Validar la integridad de los datos utilizando excepciones adecuadas.

## 🛠️ Funcionalidades del Sistema

El sistema ofrece las siguientes funcionalidades:

### 1. Gestión de Hospedaje
- **Tipos de Habitaciones**: cuenta con 1 solo tipo de habitacion general
- **Aplicación de Descuentos**: Descuentos aplicables según dias de promocion

### 2. Gestión de Gastronomía
- **Menús**: Posibilidad de agregar diferentes tipos de alimentos para los servicios de gastronomia.
- **Cálculo de Precios**: Precios ajustables con descuentos según los dias de descuento
### 3. Promociones y Descuentos
- Implementación de promociones segun dias de de la semana y fechas de promocion.
- Penalizaciones por no cumplir con los requisitos establecidos, como el número mínimo de noches.

### 4. Validaciones
- Manejo de excepciones para situaciones como códigos duplicados, valores inválidos, y violaciones de las restricciones de negocio.

### 5. Cálculo de Precio Final
- Método para calcular el precio final del servicio, que incluye todas las promociones y servicios adicionales seleccionados.

## 📦 Estructura del Proyecto

El proyecto está compuesto por las siguientes clases y subclases:

### 1. **Servicio** (Clase Abstracta)
- **Atributos**:
   - `codigo`: Código del servicio.
   - `descuento`: descuento(0-99).
   - `promo`: Precio base del servicio.
- **Métodos Abstractos**:
   - `calcularPrecioFinal()`: Método que debe ser implementado en las subclases para calcular el precio final del servicio.

### 2. **Hospedaje** (Subclase de Servicio)
- **Atributos Específicos**:
   - `hospedaje`: nombre hospedaje.
   - `precioNoche`: precio x noche.
- **Métodos**:
   - `calcularPrecioTotal()`: Calcula el precio total basado en el número de noches y promociones.

### 3. **Gastronomía** (Subclase de Servicio)
- **Atributos Específicos**:
   - `gastronomia`: nombre identificador.
   - `precio`: precio.
   - `diaSemDesc`: indica q dias aplica descuento.
- **Métodos**:
   - `calcularPrecioFinal()`: Calcula el precio final de acuerdo con las promociones disponibles.
