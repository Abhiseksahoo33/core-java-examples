# activity 04 ( abstract class hierarchy) #

# (1) LinkedList #

* class LinkedList
   
* extends AbstractSequentialList
* implements List<E>, Deque<E>, Cloneable, java.io.Serializable

## (i)AbstractSequentialList ##

*  AbstractSequentialList (abstract class)
* extends AbstractList
#### abstract method of AbstractSequentialList
* AbstractSequentialList

### (ii) AbstractList ###
*  AbstractList (abstract class)
* extends AbstractCollection
* implements List
#### Abstract methods 
* abstract public E get(int index); (overrides  on List.java)
* implimented on the following class
```
AbstractObjectList in XSSimpleTypeDecl
AbstractSequentialList
Anonymous in DatatypeWriter
Anonymous in ElementPropertyInfoImpl
Anonymous in InternetHeaders
Anonymous in PropertySorter in ClassInfoImpl
Anonymous in ProviderList
ArrayList
ArrayList in Arrays
ArrayQueue
ByteListImpl
COWSubList in CopyOnWriteArrayList
CollisionCheckStack
CopiesList in Collections
EmptyList in Collections
FreezableList
HeaderList
HttpAdapterList
IdentityArrayList
IdentityLinkedList
Index in ConstantPool
LSInputListImpl
LinkedList
ListAdapter
ListData in ListDV
ObjectListImpl
ServiceList in ProviderList
ShortListImpl
SingletonList in Collections
StringListImpl
SubList
SubList in ArrayList
Vector
XSModelImpl
XSObjectListImpl
```

#### (iii) List #### 
* interface List
* extends Collection

#### (iii)AbstractCollection ####
* AbstractCollection ( abstract class)
* implements Collection
#### Abstract methods
*  public abstract Iterator iterator();(overrides  in collection.java class )
* implimented on 
```
AbstractList
AbstractSequentialList
Anonymous in AbstractMap
Anonymous in Anonymous in Packet
Anonymous in FieldMap in ParserImplTableBase
Anonymous in Partition in Collectors
Anonymous in PreHashedMap
Anonymous in XSNamedMapImpl
ArrayBlockingQueue
ArrayDeque
ArrayList
AsLIFOQueue in Collections
AscendingEntrySetView in AscendingSubMap in TreeMap
COWSubList in CopyOnWriteArrayList
CheckedEntrySet in ProcessEnvironment
CheckedKeySet in ProcessEnvironment
CheckedValues in ProcessEnvironment
ClassSet in Subject
ConcurrentLinkedDeque
ConcurrentLinkedQueue
ConcurrentSkipListSet
CopyOnWriteArraySet
DelayQueue
DelayedWorkQueue in ScheduledThreadPoolExecutor
DescendingEntrySetView in DescendingSubMap in TreeMap
EmptyList in Collections
EmptySet in Collections
EndpointComponentSet in WSEndpointImpl
EntrySet in ConcurrentSkipListMap
EntrySet in EndpointMessageContextImpl
EntrySet in EnumMap
EntrySet in HashMap
EntrySet in Hashtable
EntrySet in IdentityHashMap
EntrySet in QNameMap
EntrySet in QNameMap
EntrySet in SoftCache
EntrySet in TreeMap
EntrySet in WeakHashMap
Fixups
GraphImpl
HashSet
JumboEnumSet
KeySet in ConcurrentSkipListMap
KeySet in EnumMap
KeySet in HashMap
KeySet in Hashtable
KeySet in IdentityHashMap
KeySet in ParallelListResourceBundle
KeySet in TreeMap
KeySet in WeakHashMap
LinkedBlockingDeque
LinkedBlockingQueue
LinkedEntrySet in LinkedHashMap
LinkedKeySet in LinkedHashMap
LinkedTransferQueue
LinkedValues in LinkedHashMap
NodeSet in DOMUtils
ParameterMapEntrySet in MimeType
PartiallyOrderedSet
PrinterStateReasonSet in PrinterStateReasons
PriorityBlockingQueue
PriorityQueue
RegularEnumSet
SecureSet in Subject
ServiceList in ProviderList
SetFromMap in Collections
SingletonList in Collections
SingletonSet in Collections
SmallSet
SubList
SubList in ArrayList
SynchronousQueue
TreeSet
ValueCollection in Hashtable
Values in ConcurrentSkipListMap
Values in EnumMap
Values in HashMap
Values in IdentityHashMap
Values in TreeMap
Values in WeakHashMap
Vector
XSModelImpl
XSObjectListImpl
```

*  public abstract int size(); (overrides in collection.java class )
* implimented on 
```
AbstractObjectList in XSSimpleTypeDecl
Anonymous in AbstractMap
Anonymous in Anonymous in Packet
Anonymous in DatatypeWriter
Anonymous in ElementPropertyInfoImpl
Anonymous in FieldMap in ParserImplTableBase
Anonymous in InternetHeaders
Anonymous in Partition in Collectors
Anonymous in PreHashedMap
Anonymous in PropertySorter in ClassInfoImpl
Anonymous in ProviderList
Anonymous in XSNamedMapImpl
ArrayBlockingQueue
ArrayDeque
ArrayList
ArrayList in Arrays
ArrayQueue
AsLIFOQueue in Collections
ByteListImpl
COWSubList in CopyOnWriteArrayList
CheckedEntrySet in ProcessEnvironment
CheckedKeySet in ProcessEnvironment
CheckedValues in ProcessEnvironment
ClassSet in Subject
CollisionCheckStack
ConcurrentLinkedDeque
ConcurrentLinkedQueue
ConcurrentSkipListSet
CopiesList in Collections
CopyOnWriteArraySet
DelayQueue
DelayedWorkQueue in ScheduledThreadPoolExecutor
EmptyList in Collections
EmptySet in Collections
EntrySet in ConcurrentSkipListMap
EntrySet in EndpointMessageContextImpl
EntrySet in EnumMap
EntrySet in HashMap
EntrySet in Hashtable
EntrySet in IdentityHashMap
EntrySet in QNameMap
EntrySet in QNameMap
EntrySet in SoftCache
EntrySet in TreeMap
EntrySet in WeakHashMap
EntrySetView in NavigableSubMap in TreeMap
Fixups
FreezableList
GraphImpl
HashSet
HeaderList
HttpAdapterList
IdentityArrayList
IdentityLinkedList
Index in ConstantPool
JumboEnumSet
KeySet in ConcurrentSkipListMap
KeySet in EnumMap
KeySet in HashMap
KeySet in Hashtable
KeySet in IdentityHashMap
KeySet in ParallelListResourceBundle
KeySet in TreeMap
KeySet in WeakHashMap
LSInputListImpl
LinkedBlockingDeque
LinkedBlockingQueue
LinkedEntrySet in LinkedHashMap
LinkedKeySet in LinkedHashMap
LinkedList
LinkedTransferQueue
LinkedValues in LinkedHashMap
ListAdapter
ListData in ListDV
NodeSet in DOMUtils
ObjectListImpl
ParameterMapEntrySet in MimeType
PartiallyOrderedSet
PrinterStateReasonSet in PrinterStateReasons
PriorityBlockingQueue
PriorityQueue
RegularEnumSet
SecureSet in Subject
ServiceList in ProviderList
SetFromMap in Collections
ShortListImpl
SingletonList in Collections
SingletonSet in Collections
SmallSet
StringListImpl
SubList
SubList in ArrayList
SynchronousQueue
TreeSet
ValueCollection in Hashtable
Values in ConcurrentSkipListMap
Values in EnumMap
Values in HashMap
Values in IdentityHashMap
Values in TreeMap
Values in WeakHashMap
Vector
XSModelImpl
XSObjectListImpl
```

##### (iv)Collection ##### 
*  Collection (interface)
* extends Iterable

###### (v) Iterable ######
*  Iterable(interface)

 

# (2) ArrayList #

* class ArrayList
* extends AbstractList
* implements List , RandomAccess, Cloneable, java.io.Serializable

## (i)AbstractList ## 

*  AbstractList (abstract class)
* extends AbstractCollection
* implements List
#### Abstract methods 
* abstract public E get(int index);(overrides  on List.java)


### (ii) List ### 
* interface List
* extends Collection

### (ii) AbstractCollection ###
* AbstractCollection ( abstract class)
* implements Collection
#### Abstract methods
*  public abstract Iterator iterator();(overrides  in collection.java class )


*  public abstract int size();(implimented on collection.java class )

#### (iii)Collection #### 
*  Collection (interface)
* extends Iterable

##### (iv)Iterable #####
*  Iterable(interface)

# (3) Stack #
* class Stack
* extends Vector
## (i)Vector ##
* class Vector
* extends AbstractList
* implements List, RandomAccess, Cloneable, java.io.Serializable
### (ii) Abstract List ### 


*  AbstractList (abstract class)
* extends AbstractCollection
* implements List
#### Abstract methods 
* abstract public E get(int index);(overrides on List.java)


#### (iii) List #### 
* interface List
* extends Collection

#### (iii) AbstractCollection ####
* AbstractCollection ( abstract class)
* implements Collection
#### Abstract methods
*  public abstract Iterator<E> iterator();(overrides  in collection.java class )

*  public abstract int size();(implimented on collection.java class )

##### (iv)Collection ##### 
*  Collection (interface)
* extends Iterable

###### (v)Iterable ######
*  Iterable(interface)

# (4) ArrayBlockingQueue #
* class ArrayBlockingQueue
* extends AbstractQueue
* implements BlockingQueue , java.io.Serializable
## (i)AbstractQueue ## 
*  AbstractQueue(abstract class)
* extends AbstractCollection
* implements Queue
### (ii)AbstractCollection ###

* AbstractCollection ( abstract class)
* implements Collection
#### Abstract methods
*  public abstract Iterator<E> iterator();(overrides  in collection.java class )

*  public abstract int size();(implimented on collection.java class )

### (ii) queue ###
*  Queue (interface)
* extends Collection

### (iii)Collection ### 
*  Collection (interface)
* extends Iterable

#### (iv)Iterable ####
*  Iterable(interface)

# (5) Linked Blocking Queue #

* class LinkedBlockingQueue
* extends AbstractQueue
* implements BlockingQueue, java.io.Serializable 

## (a-i ) Abstractqueue ##
*  AbstractQueue (abstract class)
* extends AbstractCollection

### (a-ii)AbstractCollection ###

* AbstractCollection ( abstract class)
* implements Collection
#### Abstract methods
*  public abstract Iterator<E> iterator();(overrides  in collection.java class )


*  public abstract int size();(implimented on collection.java class )

#### (a-iii)Collection #### 
*  Collection (interface)
* extends Iterable

##### (a-iv)Iterable #####
*  Iterable(interface)
## BlockingQueue ##
*  BlockingQueue (interface)
* extends Queue

### (b-i) queue ###
*  Queue (interface)
* extends Collection

### (b-ii)Collection ### 
*  Collection (interface)
* extends Iterable

#### (b-iii)Iterable ####
*  Iterable(interface)


