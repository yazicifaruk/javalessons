package courseApi.courseApiApp;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService{

    private List<Topic> topics= new ArrayList<>(Arrays.asList(
                new Topic("Spring","Spring framework","Spring description"),
                new Topic("java","java framework","java description"),
                new Topic("javaspript","javasprict framework","javasprict description")
        ));
    public List<Topic> getAlltopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
public void updateTopic(String id,Topic topic) {
    Topic t = null;
    for (int i = 0; i < topics.size(); i++){
        t = topics.get(i);
    if (t.getId().equals(id)) {
        topics.set(i, topic);
        return;
    }

}}

    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}
