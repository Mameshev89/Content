package manager;

import domain.Post;

public class PostManager {
    private AllManagerCaller[] managers;

    public Post[] search(String[] wall) {
        for (AllManagerCaller manager : managers) {
            wall = manager.generateBlock();
        }
        //to do some logic
        return null;
    }

    public void delete() {
        //to do some logic
    }
}
