package domain;

public class Post {
    private int id; //Идентификатор записи.
    private int ownerId;//Идентификатор владельца стены на которой была размещена запись.
    private int fromId; //Идентификатор автора записи.
    private int adminId;//Идентификатор администратора который опубликовал запись.
    private int date;//Время публикации записи.
    private String text;//текс записи.
    private int replyOwnerId;//Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;//Идентификатор записи в ответ на которую была оставлена текущая.
    private int friendsOnly;// Если запись была с опцией только для друзей.
    private CommentInfo commentInfo;//Информация о комментариях к записи.
    private News news;//Источник материала
    private LikeInfo likeCount;
    private Share repost;//Информация о репостах записи(Рассказать друзьям)
    private View views;
    private String postType;// Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSource postSource;
    private Geo geo;//Информация о месте расположения.
    private int singerId;//Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем.
    private int[] canPin;//Информация о том, может ли текущий пользователь закрепить запись.
    private int[] canDelete;//Информация о том, может ли текущий пользователь удалить запись.
    private int[] canEdit;//Информация о том, может ли текущий пользователь редактировать запись.
    private int[] isPinned;//Информация о том, что запись закреплена.
    private int markedAsAds;//Информация о том, содержит ли запись отметку "реклама".
    private boolean isFavorite;
    private Donut donut;//Информация о записи VK Donut.
    private int postponedId;// Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


}
