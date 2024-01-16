package org.example;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlValue;

@XmlRootElement
public class SampleXml {

    private String v;
    private String textContent;

    public SampleXml() {
        // Empty constructor required for JAXB
    }

    public SampleXml(String v, String textContent) {
        this.v = v;
        this.textContent = textContent;
    }

    @XmlAttribute(name = "v")
    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    @XmlValue
    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}