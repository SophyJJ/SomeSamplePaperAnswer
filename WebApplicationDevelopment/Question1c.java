public <T> T[] convertCollectionToArray(List<T> list){
    return list.toArray();
}

public <T> List<T> convertArrayToCollection(T[] array){
    List<T> list = new List<T>
    for(int i = 0; i < array.length(); i++){
        list.add(array[i]);
    }
    return list;
}