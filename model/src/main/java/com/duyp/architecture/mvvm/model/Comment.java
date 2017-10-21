package com.duyp.architecture.mvvm.model;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by duypham on 10/21/17.
 *
 */

public class Comment extends RealmObject{

    @PrimaryKey
    long id;
    User user;
    String url;
    String body;
    String bodyHtml;
    String htmlUrl;
    Date createdAt;
    Date updatedAt;
    int position;
    int line;
    String path;
    String commitId;
    String repoId;
    String login;
    String gistId;
    String issueId;
    String pullRequestId;
    ReactionsModel reactions;
    String authorAssociation;
}