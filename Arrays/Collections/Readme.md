# List Operations in Java

## ArrayList

## Insertion and Addition

### `void add(int index, E element)`
Inserts the specified element at the specified position in a list.

### `boolean add(E e)`
Appends the specified element at the end of a list.

### `boolean addAll(Collection<? extends E> c)`
Appends all elements in the specified collection to the end of this list.

### `boolean addAll(int index, Collection<? extends E> c)`
Appends all elements in the specified collection, starting at the specified position of the list.

## Deletion and Clearing

### `void clear()`
Removes all elements from the list.

### `E remove(int index)`
Removes the element at the specified position in the list.

### `boolean remove(Object o)`
Removes the first occurrence of the specified element.

### `boolean removeAll(Collection<?> c)`
Removes all elements from the list that are present in the specified collection.

## Retrieval and Checking

### `E get(int index)`
Fetches the element from the specified position of the list.

### `boolean contains(Object o)`
Returns true if the list contains the specified element.

### `int indexOf(Object o)`
Returns the index of the first occurrence of the specified element, or -1 if not present.

### `int lastIndexOf(Object o)`
Returns the index of the last occurrence of the specified element, or -1 if not present.

### `boolean isEmpty()`
Returns true if the list is empty, otherwise false.

## Modification and Sorting

### `E set(int index, E element)`
Replaces the specified element in the list at the specified position.

### `void sort(Comparator<? super E> c)`
Sorts the elements of the list based on the specified comparator.

## Information Retrieval

### `List<E> subList(int fromIndex, int toIndex)`
Fetches all elements within the given range.

### `int size()`
Returns the number of elements present in the list.
