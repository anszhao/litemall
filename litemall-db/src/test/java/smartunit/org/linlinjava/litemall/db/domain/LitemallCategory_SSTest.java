/*
 * This file was automatically generated by SmartUnit
 */

package smartunit.org.linlinjava.litemall.db.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import org.junit.runner.RunWith;
import org.linlinjava.litemall.db.domain.LitemallCategory;
import org.smartunit.runtime.PrivateAccess;
import org.smartunit.runtime.SmartRunner;
import org.smartunit.runtime.SmartRunnerParameters;

@RunWith(SmartRunner.class) @SmartRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LitemallCategory_SSTest extends LitemallCategory_SSTest_scaffolding {
// allCoveredLines:[7, 141, 153, 154, 165, 177, 178, 189, 201, 202, 213, 225, 226, 237, 249, 250, 261, 273, 274, 285, 297, 298, 309, 321, 322, 333, 345, 346, 357, 369, 370, 381, 393, 394, 403, 404, 415, 427, 428, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 468, 469, 471, 472, 474, 475, 477, 478, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 561, 571, 581, 660, 670, 680, 690, 713, 723, 733, 734, 735, 737, 747, 748, 750, 761]

  @Test(timeout = 4000)
  public void test_andLogicalDeleted_00()  throws Throwable  {
      //caseID:68f2088687bb2de3490fe959eabdf101
      //CoveredLines: [7, 403, 404, 427, 428, 571]
      //Input_0_boolean: litemallCategory0.IS_DELETED
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: andLogicalDeleted
      litemallCategory0.andLogicalDeleted((boolean) litemallCategory0.IS_DELETED);
      
      //Test Result Assert
      assertNull(litemallCategory0.getDesc());
  }

  @Test(timeout = 4000)
  public void test_andLogicalDeleted_01()  throws Throwable  {
      //caseID:a7ccad094d88e3e731e6009d248af5d5
      //CoveredLines: [7, 357, 403, 404, 427, 428, 571]
      //Input_0_boolean: litemallCategory0.NOT_DELETED
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: andLogicalDeleted
      litemallCategory0.andLogicalDeleted((boolean) litemallCategory0.NOT_DELETED);
      
      //Test Result Assert
      assertNull(litemallCategory0.getLevel());
  }

  @Test(timeout = 4000)
  public void test_asc_02()  throws Throwable  {
      //caseID:e631a2fee11689671de6ea1af4b7d056
      //CoveredLines: [7, 723, 747, 748]
      //Assert: assertEquals("`level` ASC", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.level;
      
      //Call method: asc
      String string0 = litemallCategory_Column0.asc();
      
      //Test Result Assert
      assertEquals("`level` ASC", string0);
  }

  @Test(timeout = 4000)
  public void test_desc_03()  throws Throwable  {
      //caseID:699be08cdc9c86d7bbb66b5f8d4f84a3
      //CoveredLines: [7, 381, 713, 747, 750]
      //Assert: assertEquals("id DESC", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.id;
      
      //Call method: desc
      String string0 = litemallCategory_Column0.desc();
      
      //Test Result Assert
      assertEquals("id DESC", string0);
  }

  @Test(timeout = 4000)
  public void test_desc_04()  throws Throwable  {
      //caseID:b74e218d931632a9723f88241c830f14
      //CoveredLines: [7, 381, 713, 747, 748]
      //Assert: assertEquals("`name` DESC", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.name;
      
      //Call method: desc
      String string0 = litemallCategory_Column0.desc();
      
      //Test Result Assert
      assertEquals("`name` DESC", string0);
  }

  @Test(timeout = 4000)
  public void test_equals_05()  throws Throwable  {
      //caseID:9d01bc3e14cc045110ae5942c3ddb4a9
      //CoveredLines: [7, 357, 468, 469]
      //Input_0_Object: litemallCategory0
      //Assert: assertTrue(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: equals
      boolean boolean0 = litemallCategory0.equals(litemallCategory0);
      
      //Test Result Assert
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_06()  throws Throwable  {
      //caseID:4cd8f6444eaa76cc699bc1bc05a37cf7
      //CoveredLines: [7, 357, 468, 471, 472]
      //Input_0_Object: null
      //Assert: assertFalse(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: equals
      boolean boolean0 = litemallCategory0.equals(null);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_07()  throws Throwable  {
      //caseID:bb63638b9e2aedbe5cdcdc54c371be98
      //CoveredLines: [7, 357, 468, 471, 474, 475]
      //Input_0_Object: "Via"
      //Assert: assertFalse(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: equals
      boolean boolean0 = litemallCategory0.equals("Via");
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_08()  throws Throwable  {
      //caseID:34df793e4b44bab55f6a220a7518eba6
      //CoveredLines: [7, 141, 381, 468, 471, 474, 477, 478]
      //Input_0_Object: litemallCategory0
      //Assert: assertFalse(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      Integer integer0 = new Integer(1490);
      litemallCategory0.getUpdateTime();
      PrivateAccess.setVariable((Class<?>) LitemallCategory.class, litemallCategory0, "id", (Object) integer0);
      LitemallCategory litemallCategory1 = new LitemallCategory();
      
      //Call method: equals
      boolean boolean0 = litemallCategory1.equals(litemallCategory0);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_equals_09()  throws Throwable  {
      //caseID:4f5f1eca17b3a3d3e706c1ccc4af2727
      //CoveredLines: [7, 141, 381, 468, 471, 474, 477, 478]
      //Input_0_Object: litemallCategory1
      //Assert: assertFalse(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      Integer integer0 = new Integer((byte) (-16));
      litemallCategory0.getUpdateTime();
      PrivateAccess.setVariable((Class<?>) LitemallCategory.class, litemallCategory0, "id", (Object) integer0);
      LitemallCategory litemallCategory1 = new LitemallCategory();
      
      //Call method: equals
      boolean boolean0 = litemallCategory0.equals(litemallCategory1);
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_excludes_10()  throws Throwable  {
      //caseID:9e4ed0ae11ad909c5876a11d6ff8b5ab
      //CoveredLines: [7, 381, 733, 734, 737]
      //Input_0_LitemallCategory$Column[]: null
      //Assert: assertEquals(12, method_result.length);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      
      //Call method: excludes
      LitemallCategory.Column[] litemallCategory_ColumnArray0 = LitemallCategory.Column.excludes((LitemallCategory.Column[]) null);
      
      //Test Result Assert
      assertEquals(12, litemallCategory_ColumnArray0.length);
  }

  @Test(timeout = 4000)
  public void test_excludes_11()  throws Throwable  {
      //caseID:db9b058c3b84081e5613ae996b52857d
      //CoveredLines: [7, 381, 733, 734, 737]
      //Input_0_LitemallCategory$Column[]: litemallCategory_ColumnArray0
      //Assert: assertEquals(12, method_result.length);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column[] litemallCategory_ColumnArray0 = new LitemallCategory.Column[0];
      
      //Call method: excludes
      LitemallCategory.Column[] litemallCategory_ColumnArray1 = LitemallCategory.Column.excludes(litemallCategory_ColumnArray0);
      
      //Test Result Assert
      assertEquals(12, litemallCategory_ColumnArray1.length);
  }

  @Test(timeout = 4000)
  public void test_excludes_12()  throws Throwable  {
      //caseID:28ace6cad4913d1aceccd627988df1bb
      //CoveredLines: [7, 381, 733, 734, 735, 737]
      //Input_0_LitemallCategory$Column[]: litemallCategory_ColumnArray0
      //Assert: assertNotSame(litemallCategory_ColumnArray0, method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column[] litemallCategory_ColumnArray0 = new LitemallCategory.Column[9];
      
      //Call method: excludes
      LitemallCategory.Column[] litemallCategory_ColumnArray1 = LitemallCategory.Column.excludes(litemallCategory_ColumnArray0);
      
      //Test Result Assert
      assertNotSame(litemallCategory_ColumnArray0, litemallCategory_ColumnArray1);
  }

  @Test(timeout = 4000)
  public void test_getAliasedEscapedColumnName_13()  throws Throwable  {
      //caseID:baaefcd6c6a03158cf6d88c392a3d57c
      //CoveredLines: [7, 747, 748, 761]
      //Assert: assertEquals("`name`", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.name;
      
      //Call method: getAliasedEscapedColumnName
      String string0 = litemallCategory_Column0.getAliasedEscapedColumnName();
      
      //Test Result Assert
      assertEquals("`name`", string0);
  }

  @Test(timeout = 4000)
  public void test_getJavaProperty_14()  throws Throwable  {
      //caseID:b1b63107016af6865834c23c2c7cb24d
      //CoveredLines: [7, 381, 680]
      //Assert: assertEquals("iconUrl", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.iconUrl;
      
      //Call method: getJavaProperty
      String string0 = litemallCategory_Column0.getJavaProperty();
      
      //Test Result Assert
      assertEquals("iconUrl", string0);
  }

  @Test(timeout = 4000)
  public void test_getJdbcType_15()  throws Throwable  {
      //caseID:0dad8ae02c25d72ed7118c42a48c209a
      //CoveredLines: [7, 381, 690]
      //Assert: assertEquals("TIMESTAMP", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.updateTime;
      
      //Call method: getJdbcType
      String string0 = litemallCategory_Column0.getJdbcType();
      
      //Test Result Assert
      assertEquals("TIMESTAMP", string0);
  }

  @Test(timeout = 4000)
  public void test_getName_16()  throws Throwable  {
      //caseID:372c091704f6b345b1b9408a55f6da1e
      //CoveredLines: [7, 357, 581]
      //Assert: assertEquals("\u5DF2\u5220\u9664", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      LitemallCategory.Deleted litemallCategory_Deleted0 = LitemallCategory.Deleted.IS_DELETED;
      
      //Call method: getName
      String string0 = litemallCategory_Deleted0.getName();
      
      //Test Result Assert
      assertEquals("\u5DF2\u5220\u9664", string0);
  }

  @Test(timeout = 4000)
  public void test_getValue_17()  throws Throwable  {
      //caseID:3c40f5b3c256842831754ac02fbd6ee9
      //CoveredLines: [7, 670]
      //Assert: assertEquals("icon_url", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.iconUrl;
      
      //Call method: getValue
      String string0 = litemallCategory_Column0.getValue();
      
      //Test Result Assert
      assertEquals("icon_url", string0);
  }

  @Test(timeout = 4000)
  public void test_getValue_18()  throws Throwable  {
      //caseID:951a72061c164f8cb16d44e547d4a405
      //CoveredLines: [7, 357, 561]
      //Assert: assertFalse(method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      LitemallCategory.Deleted litemallCategory_Deleted0 = LitemallCategory.Deleted.IS_DELETED;
      
      //Call method: getValue
      Boolean boolean0 = litemallCategory_Deleted0.getValue();
      
      //Test Result Assert
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test_setAddTime_19()  throws Throwable  {
      //caseID:f52b355403678e2cac150bb8634f5edf
      //CoveredLines: [7, 357, 369, 370]
      //Input_0_LocalDateTime: null
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: setAddTime
      litemallCategory0.setAddTime((LocalDateTime) null);
      
      //Test Result Assert
      assertNull(litemallCategory0.getDesc());
  }

  @Test(timeout = 4000)
  public void test_setDesc_20()  throws Throwable  {
      //caseID:b500055f6da537f12c5fb9b9602fee67
      //CoveredLines: [7, 225, 226]
      //Input_0_String: "\u5DF2\u5220\u9664"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: setDesc
      litemallCategory0.setDesc("\u5DF2\u5220\u9664");
      
      //Test Result Assert
      assertEquals("\u5DF2\u5220\u9664", litemallCategory0.getDesc());
  }

  @Test(timeout = 4000)
  public void test_setIconUrl_21()  throws Throwable  {
      //caseID:634af0a5df9b1225d9f29f1ae01091e2
      //CoveredLines: [7, 273, 274]
      //Input_0_String: "5"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: setIconUrl
      litemallCategory0.setIconUrl("5");
      
      //Test Result Assert
      assertNull(litemallCategory0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test_setId_22()  throws Throwable  {
      //caseID:d0ecd025d3e89d67ed813e834d713366
      //CoveredLines: [7, 153, 154]
      //Input_0_Integer: 128
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      Integer integer0 = new Integer(128);
      
      //Call method: setId
      litemallCategory0.setId(integer0);
      
      //Test Result Assert
      assertNull(litemallCategory0.getPicUrl());
  }

  @Test(timeout = 4000)
  public void test_setKeywords_23()  throws Throwable  {
      //caseID:b371723fc7ce5af121a78b81825129e9
      //CoveredLines: [7, 201, 202]
      //Input_0_String: "iconUrl"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: setKeywords
      litemallCategory0.setKeywords("iconUrl");
      
      //Test Result Assert
      assertNull(litemallCategory0.getDeleted());
  }

  @Test(timeout = 4000)
  public void test_setLevel_24()  throws Throwable  {
      //caseID:4593b848d06ea605e502760e0c79bb17
      //CoveredLines: [7, 321, 322]
      //Input_0_String: "0"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: setLevel
      litemallCategory0.setLevel("0");
      
      //Test Result Assert
      assertNull(litemallCategory0.getKeywords());
  }

  @Test(timeout = 4000)
  public void test_setName_25()  throws Throwable  {
      //caseID:a3ab24ae27c38908e386ace4df628920
      //CoveredLines: [7, 177, 178, 381]
      //Input_0_String: "~C:2J![G/@&}aM"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      
      //Call method: setName
      litemallCategory0.setName("~C:2J![G/@&}aM");
      
      //Test Result Assert
      assertNull(litemallCategory0.getDeleted());
  }

  @Test(timeout = 4000)
  public void test_setPicUrl_26()  throws Throwable  {
      //caseID:fae8db0cd61b6e4b40bc777606d9767c
      //CoveredLines: [7, 297, 298, 381]
      //Input_0_String: "P>&:st=dr</Q$n+"
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      
      //Call method: setPicUrl
      litemallCategory0.setPicUrl("P>&:st=dr</Q$n+");
      
      //Test Result Assert
      assertNull(litemallCategory0.getDeleted());
  }

  @Test(timeout = 4000)
  public void test_setPid_27()  throws Throwable  {
      //caseID:10b1a79325e1a6638000b952c3102120
      //CoveredLines: [7, 249, 250]
      //Input_0_Integer: (byte)0
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      Integer integer0 = new Integer((byte)0);
      
      //Call method: setPid
      litemallCategory0.setPid(integer0);
      
      //Test Result Assert
      assertEquals(0, (int)litemallCategory0.getPid());
  }

  @Test(timeout = 4000)
  public void test_setSortOrder_28()  throws Throwable  {
      //caseID:e8b39e1edd4eba82d696985b856887d4
      //CoveredLines: [7, 345, 346]
      //Input_0_Byte: (byte) (-21)
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      Byte byte0 = new Byte((byte) (-21));
      
      //Call method: setSortOrder
      litemallCategory0.setSortOrder(byte0);
      
      //Test Result Assert
      assertNull(litemallCategory0.getPid());
  }

  @Test(timeout = 4000)
  public void test_setUpdateTime_29()  throws Throwable  {
      //caseID:3f1e4b60b981043fa3ef55de048e1a9d
      //CoveredLines: [7, 357, 393, 394]
      //Input_0_LocalDateTime: null
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      
      //Call method: setUpdateTime
      litemallCategory0.setUpdateTime((LocalDateTime) null);
      
      //Test Result Assert
      assertNull(litemallCategory0.getDesc());
  }

  @Test(timeout = 4000)
  public void test_toString_30()  throws Throwable  {
      //caseID:1485b305714fc6a9dba799674194df53
      //CoveredLines: [7, 141, 165, 189, 213, 237, 261, 285, 309, 333, 357, 381, 415, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514]
      //Assert: assertEquals("LitemallCategory [Hash = -293403007, IS_DELETED=false, NOT_DELETED=false, id=null, name=null, keywords=null, desc=null, pid=null, iconUrl=null, picUrl=null, level=null, sortOrder=null, addTime=null, updateTime=null, deleted=null]", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      
      //Call method: toString
      String string0 = litemallCategory0.toString();
      
      //Test Result Assert
      assertEquals("LitemallCategory [Hash = -293403007, IS_DELETED=false, NOT_DELETED=false, id=null, name=null, keywords=null, desc=null, pid=null, iconUrl=null, picUrl=null, level=null, sortOrder=null, addTime=null, updateTime=null, deleted=null]", string0);
  }

  @Test(timeout = 4000)
  public void test_toString_31()  throws Throwable  {
      //caseID:fade7ef13cb2df7f9ec93a7c94353619
      //CoveredLines: [7, 141, 165, 189, 213, 237, 261, 285, 309, 333, 357, 381, 415, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 455, 456, 457, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514]
      //Assert: assertEquals("LitemallCategory [Hash = -293403007, IS_DELETED=false, NOT_DELETED=false, id=null, name=null, keywords=null, desc=null, pid=null, iconUrl=null, picUrl=null, level=null, sortOrder=null, addTime=null, updateTime=null, deleted=null]", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getUpdateTime();
      
      //Call method: toString
      String string0 = litemallCategory0.toString();
      
      //Test Result Assert
      assertEquals("LitemallCategory [Hash = -293403007, IS_DELETED=false, NOT_DELETED=false, id=null, name=null, keywords=null, desc=null, pid=null, iconUrl=null, picUrl=null, level=null, sortOrder=null, addTime=null, updateTime=null, deleted=null]", string0);
  }

  @Test(timeout = 4000)
  public void test_value_32()  throws Throwable  {
      //caseID:3c5d4c9f13cf19996400911f06b05116
      //CoveredLines: [7, 357, 660]
      //Assert: assertEquals("sort_order", method_result);
      
      LitemallCategory litemallCategory0 = new LitemallCategory();
      litemallCategory0.getAddTime();
      LitemallCategory.Column litemallCategory_Column0 = LitemallCategory.Column.sortOrder;
      
      //Call method: value
      String string0 = litemallCategory_Column0.value();
      
      //Test Result Assert
      assertEquals("sort_order", string0);
  }
}
