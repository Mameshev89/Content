package manager;

import domain.Post;

public class PostManager {
    private AllManagerCaller[] managers;
    private Post argument;

    public Post[] search(int ownerId,String domain,String query,boolean ownersOnly,int count,int offset) {
        for (AllManagerCaller manager : managers) {
            String[] wall = manager.generateBlock();
        }
        //to do some logic
        return null;
    }

    public void delete(int ownerId,int postId) {
        //to do some logic
    }
}
