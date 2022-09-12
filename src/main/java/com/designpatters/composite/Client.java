package com.designpatters.composite;

public class Client {
    public static void main(String args[])throws Exception {
        /*
        * Unix file search API
        * */


        File txtFile = new File("abc", "txt", 20);
        File jsonFile = new File("object", "json", 15);
        File anotherTxtFile = new File("test", "txt", 15);
        File docFile = new File("word", "doc", 30);
        File csvFile = new File("points", "csv", 100);

        Directory main = new Directory();
        Directory txtFiles = new Directory();
        Directory docFiles = new Directory();
        Directory csvFiles = new Directory();
        txtFiles.addFileSystem(txtFile);
        txtFiles.addFileSystem(anotherTxtFile);
        docFiles.addFileSystem(docFile);
        csvFiles.addFileSystem(csvFile);
        main.addFileSystem(txtFiles);
        main.addFileSystem(docFiles);
        main.addFileSystem(csvFiles);
        main.addFileSystem(jsonFile);

        SearchParams params1 = new SearchParams();
        params1.extension = "txt";
        SearchParams params2 = new SearchParams();
        params2.extension = "csv";
        SearchParams params3 = new SearchParams();
        params3.size = 20;

        //Txt or json filter
        Filter filter = new OrFilter(new ExtensionFilter(params1), new ExtensionFilter(params2));
        //System.out.println(main.getMatches(filter));

        //Text or json whose size is 20
        Filter filter2 = new AndFilter(new SizeFiler(params3), filter);
        System.out.println(main.getMatches(filter2));

    }
}
