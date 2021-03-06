package pk.cui.sc.chain.homework;

public class PDFFileHandler extends BaseHandler{
	public PDFFileHandler(String name) {
		super(name);
	}
	public void handle(File file) {
		if(file.getType()==FileType.PDF){
			System.out.println("Processing and saving pdf file... by "+name);
		}
		else if(next!=null){
			System.out.println(name+" fowards request to "+next.getName());
			next.handle(file);
		}else{
			System.out.println("File not supported");
		}

	}
}
