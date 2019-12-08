package study.pattern.prototype.schoolwork;

import java.util.Date;
import java.util.UUID;

public class ArchitectureDataServiceImpl {

    public boolean save() throws Exception{
        //修改前代码
//        for (int i = 0;i< 20;i++){
//            ArchitectureData data = new ArchitectureData();
//            data.setName(name);
//            data.setCode(code);
//            data.setDescription(desc);
//            data.setTag(tag);
//            String id = UUID.randomUUID().toString();
//            data.setId(id);
//            data.setEnableStatus(Constants.STATUS_TRUE);
//            data.setType(type);
//            data.setVersion(version);
//            data.setSYSTEMCODE(systemCode);
//            data.setCreatTime(new Date());
//            data.setUpdateTime(new Date());
//            data.setFormat("");
//            data.setPhysicalIndex("");
//            data.setSortCode("");
//        }
        //修改后
        //修改前代码
            ArchitectureData data = new ArchitectureData();
            data.setFormat("");
            data.setPhysicalIndex("");
            data.setSortCode("");
            data.setCreatTime(new Date());
            data.setUpdateTime(new Date());
        for (int i = 0;i< 20;i++){
            ArchitectureData clone = (ArchitectureData)data.clone();
            clone.setName("name");
            clone.setCode("code");
            clone.setDescription("desc");
            clone.setTag("tag");
            String id = UUID.randomUUID().toString();
            clone.setId(id);
            clone.setEnableStatus("1");
            clone.setType("type");
            clone.setVersion("version");
            clone.setSYSTEMCODE("systemCode");
        }
        return true;
    }
}
