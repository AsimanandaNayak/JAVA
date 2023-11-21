class anomynous {
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[] args)
    {
        printarray(new int[]{12,23,43});
    }
}