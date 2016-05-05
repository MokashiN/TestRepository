
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GsonExample
{

		public GsonExample()
		{
			Staff staff = createDummyObject();

			Gson gson = new Gson();
			String json = gson.toJson(staff);
			System.out.println(json);

			try (FileWriter writer = new FileWriter(".\resources\jfile\staff.json")) 
			{
				gson.toJson(staff, writer);
			}
			catch (IOException e) 
			{
            e.printStackTrace();
			}

    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }

}
