package com.example.dgInfo.model;

import groovy.transform.builder.Builder;

@Builder

public class PetInfo {
	private String filename;
	private long desertionNo;
	private int happenDt;
	private String happenPlace;
	private String kindCd;
	private String colorCd;
	private int age;
	private String weight;
	private int noticeNo;
	private int noticeSdt;
	private int noticeEdt;
	private String popfile;
	private String processState;
	private String sexCd;
	private String neuterYn;
	private String specialMark;
	private String careNm;
	private String careTel;
	private String careAddr;
	private String orgNm;
	private String chargeNm;
	private String officetel;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public long getDesertionNo() {
		return desertionNo;
	}
	public void setDesertionNo(long desertionNo) {
		this.desertionNo = desertionNo;
	}
	public int getHappenDt() {
		return happenDt;
	}
	public void setHappenDt(int happenDt) {
		this.happenDt = happenDt;
	}
	public String getHappenPlace() {
		return happenPlace;
	}
	public void setHappenPlace(String happenPlace) {
		this.happenPlace = happenPlace;
	}
	public String getKindCd() {
		return kindCd;
	}
	public void setKindCd(String kindCd) {
		this.kindCd = kindCd;
	}
	public String getColorCd() {
		return colorCd;
	}
	public void setColorCd(String colorCd) {
		this.colorCd = colorCd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public int getNoticeSdt() {
		return noticeSdt;
	}
	public void setNoticeSdt(int noticeSdt) {
		this.noticeSdt = noticeSdt;
	}
	public int getNoticeEdt() {
		return noticeEdt;
	}
	public void setNoticeEdt(int noticeEdt) {
		this.noticeEdt = noticeEdt;
	}
	public String getPopfile() {
		return popfile;
	}
	public void setPopfile(String popfile) {
		this.popfile = popfile;
	}
	public String getProcessState() {
		return processState;
	}
	public void setProcessState(String processState) {
		this.processState = processState;
	}
	public String getSexCd() {
		return sexCd;
	}
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}
	public String getNeuterYn() {
		return neuterYn;
	}
	public void setNeuterYn(String neuterYn) {
		this.neuterYn = neuterYn;
	}
	public String getSpecialMark() {
		return specialMark;
	}
	public void setSpecialMark(String specialMark) {
		this.specialMark = specialMark;
	}
	public String getCareNm() {
		return careNm;
	}
	public void setCareNm(String careNm) {
		this.careNm = careNm;
	}
	public String getCareTel() {
		return careTel;
	}
	public void setCareTel(String careTel) {
		this.careTel = careTel;
	}
	public String getCareAddr() {
		return careAddr;
	}
	public void setCareAddr(String careAddr) {
		this.careAddr = careAddr;
	}
	public String getOrgNm() {
		return orgNm;
	}
	public void setOrgNm(String orgNm) {
		this.orgNm = orgNm;
	}
	public String getChargeNm() {
		return chargeNm;
	}
	public void setChargeNm(String chargeNm) {
		this.chargeNm = chargeNm;
	}
	public String getOfficetel() {
		return officetel;
	}
	public void setOfficetel(String officetel) {
		this.officetel = officetel;
	}
	@Override
	public String toString() {
		return "PetInfo [filename=" + filename + ", desertionNo=" + desertionNo + ", happenDt=" + happenDt
				+ ", happenPlace=" + happenPlace + ", kindCd=" + kindCd + ", colorCd=" + colorCd + ", age=" + age
				+ ", weight=" + weight + ", noticeNo=" + noticeNo + ", noticeSdt=" + noticeSdt + ", noticeEdt="
				+ noticeEdt + ", popfile=" + popfile + ", processState=" + processState + ", sexCd=" + sexCd
				+ ", neuterYn=" + neuterYn + ", specialMark=" + specialMark + ", careNm=" + careNm + ", careTel="
				+ careTel + ", careAddr=" + careAddr + ", orgNm=" + orgNm + ", chargeNm=" + chargeNm + ", officetel="
				+ officetel + "]";
	}



}
