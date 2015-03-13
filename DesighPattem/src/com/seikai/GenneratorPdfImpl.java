package com.seikai;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import com.monstarlab.kumaudo.dto.profile.PortfolioDetailsDto;

public class GenneratorPdfImpl {
	
	private  PDFont fontPlain = PDType1Font.HELVETICA;
    private  PDFont fontBold = PDType1Font.HELVETICA_BOLD;
    private final float fontSizeProjectName = 22.5f;
    private final float fontSizeNomal = 10;
    private final float ratioPx = 8;
    private final float scaleImage = 0.24f;
    private final float margin = 15;
    private  float line = -1;
    private final String[] labels = {"Client : ", "Genre :", "Development period :", "Programming Langue :", "Developement range :", "Contract :"}; 
	private final String[] contenTest = {"China Boqi Environmental Solutions Technology (holding) co. ltd","iOs/Adroid APP","2 person-months","Swift/Objective-C/JavaSwift/Objecttive-C/JavaSwift/ObjectTive-C/Java","Planning","Lab"};
	private final String contenMainTest = "I have had problems setting up my classpath. First, you must prefix your CLASSPATH with .;  Otherwise when you try to compile or run your program from the command prompt you will face problems.\n Look at my CLASSPATH for in the installation tips for version 1.0.0. Second, the commons-logging-1.1.1.jar has to appear before the pdfbox-1.0.0.jar. My Java code would not execute when it was the other way around. Here is a link that gives you a good idea of how to set your CLASSPATH.\n It refers to a different situation but gives you a basic idea of how to set CLASSPATH.";
	private final float withContenLeft = 200;
	private final char tokenSpace = ' ';
	private final char tokenSlashes = '/';
	private final char tokenUnit = '\n';

	public PDDocument generatorPdfFromPortfolioDto(PortfolioDetailsDto portfolioDto) throws Exception{
		PDDocument document = new PDDocument();
        PDPage page = new PDPage(PDPage.PAGE_SIZE_A4);
        document.addPage(page);
        PDPageContentStream cos = new PDPageContentStream(document, page);
        PDRectangle rect = page.getMediaBox();
        
        writeProjectName(cos,rect, "Project Name Project Name Project Name Project Name Name Project Name Project Name Project Name Project Name Name");
        drawLineHead(cos,rect);
        writeContentLeft(cos,rect,contenTest);
        writeContetMain(cos,rect,contenMainTest);
        drawLineFooter(cos,rect);
        cos.close();
        
        return document;
	}

	private void drawLineFooter(PDPageContentStream cos, PDRectangle rect) throws IOException {
		drawLine(cos, 0.5f, 2*margin, 30, rect.getWidth() - 4*margin);
		
	}

	private void writeContetMain(PDPageContentStream cos, PDRectangle rect, String text) throws IOException {
		line += 6*ratioPx;
		List<String> listUnits = getListLinesFromText(fontSizeNomal, fontPlain, text, rect.getWidth() - 4*margin, tokenUnit);
		if(listUnits.size() > 0){
			for(String str : listUnits){
				writeMultiLinesText(cos,rect, 2*margin, rect.getHeight() - line, fontSizeNomal, fontPlain, str, rect.getWidth() - 4*margin, ' ');
			}
		}else{
			writeMultiLinesText(cos,rect, 2*margin, rect.getHeight() - line, fontSizeNomal, fontPlain, text, rect.getWidth() - 4*margin, ' ');
		}
	}
	
	public void writeTextAlignCenter(PDPageContentStream cos, PDRectangle rect,float yStart,float leading, float fontSize ,PDFont font, String text, float withText,char token) throws Exception{
		List<String> lstLinesText = getListLinesFromText(fontSize, font, text, withText, token);
		float midPoint = rect.getWidth()*0.5f;
		float increase = leading * fontSize;
		float midPointLineText = 0;
		int i = 0;
		for(String str : lstLinesText){
			midPointLineText = 0.5f*getWithTextSize(fontSize, str, font);
			if(i!=0){
				yStart = yStart -increase;
			}
			writeSingleLineText(cos, font, fontSize, midPoint - midPointLineText,yStart, str);
			line+=increase;
			i++;
		}
		line-=increase;
	}


	private void writeContentLeft(PDPageContentStream cos, PDRectangle rect, String[] contenTest2) throws Exception {
		int i = 0;
		float height = rect.getHeight();
		char token = ' ';
		line += 2*ratioPx;
		for(String str : labels){
			line += ratioPx;
			writeSingleLineText(cos, fontBold, fontSizeNomal, 2*margin, height - line, str);
			line += 2*ratioPx;
			if(i == 1 || i == 3 || i == 4){
				token = tokenSlashes;
				
			}else{
				token = tokenSpace;
			}
			writeMultiLinesText(cos,rect, 2*margin, height - line, fontSizeNomal, fontPlain, contenTest2[i], withContenLeft,token);
			i++;
		}
		
	}

	private void drawLineHead(PDPageContentStream cos, PDRectangle rect) throws IOException {
		line +=  2*ratioPx;
		drawLine(cos, 0.5f, 2*margin, rect.getHeight() - line, rect.getWidth() - 4*margin);
	}

	private void writeProjectName(PDPageContentStream cos, PDRectangle rect,String text) throws Exception {
		line = 7*ratioPx;
		writeTextAlignCenter(cos, rect, rect.getHeight() - line,1.3f, fontSizeProjectName, fontPlain, text, rect.getWidth() - 4*margin, ' ');
	}
	public void writeSingleLineText(PDPageContentStream cos,PDFont font, float fontSize,float x, float y,String text) throws Exception{
		cos.beginText();
        cos.setFont(font, fontSize);
        cos.moveTextPositionByAmount(x,y);
        cos.drawString(text);
        cos.endText();
	}
	public float getWithTextSize(float fontSize, String text, PDFont font) throws IOException{
		 float size = fontSize * (font.getStringWidth(text) / 1000);
		 return size;
	}
	public void drawLine(PDPageContentStream cos,float lineWidth, float x, float y, float lenght) throws IOException{
		cos.setLineWidth(lineWidth); 
		cos.drawLine(x, y, x+lenght, y);
	}
	
	public void writeMultiLinesText(PDPageContentStream cos,PDRectangle rect,float startX, float startY, float fontSize, PDFont font, String text, float width, char token) throws IOException{
		float leading = 1.5f * fontSize;
		List<String> lines = getListLinesFromText(fontSize, font, text, width, token);
		cos.beginText();
	    cos.setFont(font, fontSize);
	    cos.moveTextPositionByAmount(startX, startY);
	            
	    for (String str: lines)
	    {
	        cos.drawString(str);
	        cos.moveTextPositionByAmount(0, -leading);
	        line += leading;
	    }
	    cos.endText(); 
	}
	
	private List<String> getListLinesFromText(float fontSize, PDFont font, String text,float width,char token) throws IOException{
		int lastSpace = -1;
		List<String> lines = new ArrayList<String>();
		while (text.length() > 0)
	    {
	        int spaceIndex = text.indexOf(token, lastSpace + 1);
	        if (spaceIndex < 0)
	        {
	            lines.add(text);
	            text = "";
	        }
	        else
	        {
	            String subString = text.substring(0, spaceIndex);
	            float size = fontSize * font.getStringWidth(subString) / 1000;
	            if (size > width)
	            {
	                if (lastSpace < 0)
	                    lastSpace = spaceIndex;
	                subString = text.substring(0, lastSpace);
	                lines.add(subString);
	                text = text.substring(lastSpace).trim();
	                lastSpace = -1;
	            }
	            else
	            {
	                lastSpace = spaceIndex;
	            }
	        }
	    }
		return lines;
	}
	
	public static void main(String[] args) throws Exception {
		GenneratorPdfImpl gen = new GenneratorPdfImpl();
		PDDocument document = gen.generatorPdfFromPortfolioDto(new PortfolioDetailsDto());
		document.save("test.pdf");
	}
}
