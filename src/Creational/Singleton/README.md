## Singleton Pattern

### Objective
Create object and enforce that it cannot be created again and provide api to retrieve original repeatedly.

### Concept
Only create private constructor and store a private static parameter of the singleton class.  Create a public static getter for the singleton and only call private constructor in the event that the singleton stored is null.  ( ie. the first call )

  
