## Prototype Pattern

### Objective
Create an expensive object by storing a template to copy from rather than generating from scratch.
Create duplicates while keeping performance in mind.

### Concept
Prototypes have a registry they are usually stored in to provide access to commonly built objects.

A hash map of name->prototype is usually sufficient for implementing the registry, but more complex stores could be used.

Java Cloneable interface provides clean interface for field-for-field clone of implementing classes.

clone() performs a shallow copy and you must assign child attributes that are non-primitive.  
  
