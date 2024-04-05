//src dirección actual del archivo
//dst destino del archivo
public void copiarPegarArchivo(File src, File dst) throws IOException{
	try {
 
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst+src.getName());
 
		byte[] b = new byte[1024];
		int l;
		while((l = in.read(b)) >0){
			out.write(b, 0, l);
		}
 
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}