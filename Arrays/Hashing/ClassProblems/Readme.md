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