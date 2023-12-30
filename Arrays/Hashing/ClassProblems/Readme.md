# Arrays vs Hashmaps

## Indexing

- **Arrays:** Elements in an array are typically accessed using integer indices. Arrays provide constant-time access to elements based on their index.

- **Hashmaps:** Elements in a hashmap are accessed using keys. Hashmaps provide constant-time average-case complexity for lookups, inserts, and deletes, but their performance can degrade in certain situations.

## Ordered vs Unordered

- **Arrays:** Elements in an array are ordered, meaning they have a specific order, and you can access elements by their position.

- **Hashmaps:** Traditionally, hashmaps do not guarantee any specific order of elements. However, some modern programming languages and libraries provide ordered or sorted implementations of hashmaps.

## Memory Allocation

- **Arrays:** Contiguous block of memory is allocated to store array elements. This leads to efficient memory access and cache locality.

- **Hashmaps:** Memory allocation for hashmaps is more dynamic and involves managing a data structure that allows for efficient key-based access. This may result in scattered memory locations.

## Flexibility and Dynamic Sizing

- **Arrays:** In many languages, arrays have a fixed size. If you need to resize an array, you may need to create a new one and copy elements over.

- **Hashmaps:** Hashmaps can dynamically resize themselves to accommodate a variable number of elements.

## Key Types

- **Arrays:** Keys are implicitly defined by integer indices.

- **Hashmaps:** Keys can be of various types, not limited to integers. They can be strings, objects, or any other hashable types.

# Map Operations in Java

## Clearing and Checking

### `void clear()`
Removes all key-value mappings from this map.

### `boolean isEmpty()`
Returns true if this map contains no key-value mappings.

## Retrieving Views

### `Set entrySet()`
Returns a collection view of the mappings contained in this map.

### `Set keySet()`
Returns a set view of the keys contained in this map.

## Insertion and Modification

### `V put(Object key, Object value)`
Inserts an entry into the map with the specified key and value.

### `void putAll(Map map)`
Inserts all entries from the specified map into this map.

### `V remove(Object key)`
Deletes an entry for the specified key.

### `boolean remove(Object key, Object value)`
Removes the specified values associated with the specified keys from the map.

## Checking for Values and Keys

### `boolean containsValue(Object value)`
Returns true if some value equal to the specified value exists within the map, otherwise false.

### `boolean containsKey(Object key)`
Returns true if some key equal to the specified key exists within the map, otherwise false.

## Retrieving Values

### `V get(Object key)`
Returns the object that contains the value associated with the specified key.

### `V getOrDefault(Object key, V defaultValue)`
Returns the value to which the specified key is mapped, or `defaultValue` if the map contains no mapping for the key.

## Information Retrieval

### `boolean isEmpty()`
Returns true if the map is empty; returns false if it contains at least one key.

### `Collection<V> values()`
Returns a collection view of the values contained in the map.

### `int size()`
Returns the number of entries in the map.
