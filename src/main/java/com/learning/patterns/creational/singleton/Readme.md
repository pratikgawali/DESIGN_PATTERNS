
# SINGLETON DESIGN PATTERN

## EARLY LOADED SINGLETON

### PROs:
1. Thread Safe (Class loading by JVM is synchronized) 

### CONs:
  1. Unnecessary instantiation of singleton when instance creation is very expensive operation and it is uncertain whether the instance would be used at all.
  2. Can be destroyed via Reflection APIs

## LAZY LOADED SINGLETON

### PROs:
1. Instantiation only when needed (ideal when instance creation is expensive and rare). 
As a result faster application start up compared to eagerly loaded singleton pattern.

### CONs:
  1. Not thread safe
  2. Can be destroyed via Reflection APIs

## DOUBLY CHECKED LOCKING SINGLETON

### PROs:
1. Instantiation only when needed (ideal when instance creation is expensive and rare).
As a result faster application start up compared to eagerly loaded singleton pattern. 
2. Thread safe

### CONs:
  1. It does not work reliably in a platform-independent manner without additional synchronization for mutable instances of anything other than float or int.
  2. Can be destroyed via Reflection APIs

## BILL PUGH SINGLETON

### PROs:
1. Lazy loading as static inner class are loaded only when they are referenced
2. Thread safe (Class loading by JVM is synchronized) 

### CONs:
1. Can be destroyed via Reflection APIs

## ENUM SINGLETON

### PROs:
1. Cannot be destroyed via Reflection APIs
2. Thread safe (Class loading by JVM is synchronized) 

### CONs:
1. Does not support lazy loading
