package me.zhige.domain;

public class Warehouserproblem {
    private Integer problemid;

    private String problemname;

    private Integer levelid;

    private String levelname;

    private String problemnameanswer;

    private Integer importdate;

    private Integer pageviews;

    public Integer getProblemid() {
        return problemid;
    }

    public void setProblemid(Integer problemid) {
        this.problemid = problemid;
    }

    public String getProblemname() {
        return problemname;
    }

    public void setProblemname(String problemname) {
        this.problemname = problemname == null ? null : problemname.trim();
    }

    public Integer getLevelid() {
        return levelid;
    }

    public void setLevelid(Integer levelid) {
        this.levelid = levelid;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname == null ? null : levelname.trim();
    }

    public String getProblemnameanswer() {
        return problemnameanswer;
    }

    public void setProblemnameanswer(String problemnameanswer) {
        this.problemnameanswer = problemnameanswer == null ? null : problemnameanswer.trim();
    }

    public Integer getImportdate() {
        return importdate;
    }

    public void setImportdate(Integer importdate) {
        this.importdate = importdate;
    }

    public Integer getPageviews() {
        return pageviews;
    }

    public void setPageviews(Integer pageviews) {
        this.pageviews = pageviews;
    }
}