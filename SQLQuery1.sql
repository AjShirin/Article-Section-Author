USE MavenApi;

SELECT * From AuthorT;
SELECT * From ArticleT;
SELECT * From SectionT;

--What are the top 5 sections with the most articles?--
SELECT TOP 5 section FROM ArticleT;
--How many articles were written by each author?--
SELECT title AS Article,author FROM AuthorT ;
SELECT author,count (*) AS Article,title FROM AuthorT Group by author ;
--What are the top 10 articles with the most views?--




DROP TABLE ArticleT;
