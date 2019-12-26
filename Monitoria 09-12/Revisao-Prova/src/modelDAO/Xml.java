package modelDAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;

import modelVO.Produto;

public class Xml {

	private XStream xStream;
	private File file;

	public Xml() {

		xStream = new XStream(new Dom4JDriver());
		file = new File("arquivo/produtos.xml");

		xStream.alias("Produto", Produto.class);
	}

	public boolean salvar(ArrayList<Produto> produtos) {

		try {

			if (!file.exists()) {
				file.createNewFile();
			}
			else {
				file.delete();
				file.createNewFile();
			}

			FileOutputStream outputStream = new FileOutputStream(file);
			outputStream.write(xStream.toXML(produtos).getBytes());

			return true; 
		} catch (IOException e) {
			return false;
		}

	}

	public ArrayList<Produto> ler(){

		ArrayList<Produto> produtos = null;

		try {
			
			if(!file.exists()) {
				file.createNewFile();
			}
			else {
				FileInputStream inputStream = new FileInputStream(file); 
				produtos = (ArrayList<Produto>) xStream.fromXML(inputStream);
				
				return produtos;
			}
			
		} catch (IOException e) {
			return new ArrayList<Produto>();
		}

		return new ArrayList<Produto>();


	}

}
