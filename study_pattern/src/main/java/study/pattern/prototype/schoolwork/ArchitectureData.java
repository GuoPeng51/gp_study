package study.pattern.prototype.schoolwork;

import java.util.Date;

//修改前未实现Cloneable接口
public class ArchitectureData implements Cloneable {

	private String Id;
	private String Name;
	private String code;
	private String Description;
	private String Type;
	private String Tag;
	private String version;
	private Date CreatTime;
	private Date UpdateTime;
	private String physicalIndex;
	private String format;
	private String enableStatus;
	private String SYSTEMCODE;
	private String SortCode;
	private String jsonString;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getTag() {
		return Tag;
	}

	public void setTag(String tag) {
		Tag = tag;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getCreatTime() {
		return CreatTime;
	}

	public void setCreatTime(Date creatTime) {
		CreatTime = creatTime;
	}

	public Date getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}

	public String getPhysicalIndex() {
		return physicalIndex;
	}

	public void setPhysicalIndex(String physicalIndex) {
		this.physicalIndex = physicalIndex;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(String enableStatus) {
		this.enableStatus = enableStatus;
	}

	public String getSYSTEMCODE() {
		return SYSTEMCODE;
	}

	public void setSYSTEMCODE(String sYSTEMCODE) {
		SYSTEMCODE = sYSTEMCODE;
	}

	public String getSortCode() {
		return SortCode;
	}

	public void setSortCode(String sortCode) {
		SortCode = sortCode;
	}

	public String getJsonString() {
		return jsonString;
	}

	public void setJsonString(String jsonString) {
		this.jsonString = jsonString;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
