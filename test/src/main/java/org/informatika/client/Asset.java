
package org.informatika.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="harga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kategori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kondisi" type="{http://service.informatika.org/}assetCondition" minOccurs="0"/>
 *         &lt;element name="nama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pemilik" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publicAsset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tanggalMasuk" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="vendor" type="{http://service.informatika.org/}vendor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asset", propOrder = {
    "harga",
    "id",
    "kategori",
    "kondisi",
    "nama",
    "pemilik",
    "publicAsset",
    "tanggalMasuk",
    "vendor"
})
public class Asset {

    protected String harga;
    protected int id;
    protected String kategori;
    @XmlSchemaType(name = "string")
    protected AssetCondition kondisi;
    protected String nama;
    protected String pemilik;
    protected boolean publicAsset;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tanggalMasuk;
    protected Vendor vendor;

    /**
     * Gets the value of the harga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarga() {
        return harga;
    }

    /**
     * Sets the value of the harga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarga(String value) {
        this.harga = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the kategori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategori() {
        return kategori;
    }

    /**
     * Sets the value of the kategori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategori(String value) {
        this.kategori = value;
    }

    /**
     * Gets the value of the kondisi property.
     * 
     * @return
     *     possible object is
     *     {@link AssetCondition }
     *     
     */
    public AssetCondition getKondisi() {
        return kondisi;
    }

    /**
     * Sets the value of the kondisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetCondition }
     *     
     */
    public void setKondisi(AssetCondition value) {
        this.kondisi = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the pemilik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPemilik() {
        return pemilik;
    }

    /**
     * Sets the value of the pemilik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPemilik(String value) {
        this.pemilik = value;
    }

    /**
     * Gets the value of the publicAsset property.
     * 
     */
    public boolean isPublicAsset() {
        return publicAsset;
    }

    /**
     * Sets the value of the publicAsset property.
     * 
     */
    public void setPublicAsset(boolean value) {
        this.publicAsset = value;
    }

    /**
     * Gets the value of the tanggalMasuk property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTanggalMasuk() {
        return tanggalMasuk;
    }

    /**
     * Sets the value of the tanggalMasuk property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTanggalMasuk(XMLGregorianCalendar value) {
        this.tanggalMasuk = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link Vendor }
     *     
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vendor }
     *     
     */
    public void setVendor(Vendor value) {
        this.vendor = value;
    }

}
