import com.google.gson.Gson;


public class Demo {
	public static void main(String[] args) {
		System.out.println("----bean to json");
		TagCloudBean cloud=new TagCloudBean("NCTU", 1, 2);
		Gson gson=new Gson();
		String json=gson.toJson(cloud);
		System.out.println("cloud json: "+json);
		
		System.out.println("----json to bean");
		TagCloudBean new_cloud=gson.fromJson(json, TagCloudBean.class);
		System.out.println("cloud name: "+new_cloud.getName());
		System.out.println("cloud id: "+new_cloud.getId());
		System.out.println("cloud support: "+new_cloud.getSupport());
	}
}
