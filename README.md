# BMCOE Library

## Descripción
BMCOE (Budget Management) es una librería Java diseñada para la gestión de presupuestos y costes generales. Proporciona una estructura para manejar diferentes tipos de costes, validaciones y cálculos de presupuestos.

## Características Principales
- Gestión de presupuestos con múltiples tipos de costes
- Sistema de validación de costes generales
- Cálculo automático de totales
- Soporte para diferentes tipos de filas de presupuesto

## Estructura del Proyecto
```
es.mde.bmcoe
├── Budget (Interfaz)
│   └── BudgetImpl
├── Row (Interfaz)
│   └── RowImpl (Abstracta)
│       ├── OverheadCostImpl
│       ├── IndirectCostImpl
│       └── RowPOWImpl
```

## Instalación

### Usando JitPack
Para usar esta librería en tu proyecto, añadir el repositorio de JitPack al archivo `build.gradle`:

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

Luego, añadir la dependencia:

```gradle
dependencies {
    implementation 'com.github.[USUARIO]:bmcoe-Libreria:[VERSION]'
}
```

### Tipos de Costes Disponibles
1. **OverheadCost**: Costes generales que requieren validación
2. **IndirectCost**: Costes indirectos
3. **RowPOW**: Filas de proyecto de trabajo

## Requisitos
- Java 8 o superior
- Gradle 7.0 o superior 
