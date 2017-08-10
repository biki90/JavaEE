<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Rankings</title>
        <link rel="stylesheet" href="style.css" type="text/css" />
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
            }
        </style>
        <style>
            table, th, td {
                border: 1px solid black;
                border-collapse: collapse;
            }
            th, td {
                padding: 5px;
            }
        </style>
    </head>
    <body>
        <div id="page">
            <div id="logo">
                <img src="logo.jpg" alt="logo" style="width:304px;height:228px;">
                <h1><a href="/" id="logoLink">Ranking in Team</a></h1>
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>		
                        <th>Rank in Team</th>
                        <th>Rank in Camp Blue Skies</th>
                        <th>Team Name</th>    
                        <th>Team Number</th>   
                        <th>Points</th>		
                        <th>Tiebreaker1</th>
                        <th>Tiebreaker2</th>
                        <th>Pool ID</th>
                        <th>Email</th>
                    </tr>
                    <c:forEach var="row" items="${sortedEntriesByRankInTeam}" varStatus="loop">
                    <tr>
                        <td><c:out value="${row.firstName}"/></td>
                        <td><c:out value="${row.lastName}"/></td>
                        <td><c:out value="${loop.index+1}"/></td>
                        <td><c:out value="${row.rank}"/></td>
                        <td><c:out value="${row.teamName}"/></td>
                        <td><c:out value="${row.teamNumber}"/></td>
                        <td><c:out value="${row.points}"/></td>
                        <td><c:out value="${row.tieBreaker1}"/></td>
                        <td><c:out value="${row.tieBreaker2}"/></td>
                        <td><c:out value="${row.poolID}"/></td>
                        <td><c:out value="${row.email}"/></td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
            <div id="nav">
                <ul>
                    <li><a href="#/index.jsp">Rankings</a></li>
                    <li><a href="index.jsp">Show Rankings</a></li>
                </ul>
            </div>
            <div id="content">
                <h2>Rankings in Camp Blue Skies</h2>
                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>		
                        <th>Rank in Camp Blue Skies</th>
                        <th>Team Name</th>    
                        <th>Team Number</th>   
                        <th>Points</th>		
                        <th>Tiebreaker1</th>
                        <th>Tiebreaker2</th>
                        <th>Pool ID</th>
                        <th>Email</th>
                    </tr>
                    <c:forEach var="row" items="${campBlueSkiesSortedEntries}">
                    <tr>
                        <td><c:out value="${row.firstName}"/></td>
                        <td><c:out value="${row.lastName}"/></td>
                        <td><c:out value="${row.rank}"/></td>
                        <td><c:out value="${row.teamName}"/></td>
                        <td><c:out value="${row.teamNumber}"/></td>
                        <td><c:out value="${row.points}"/></td>
                        <td><c:out value="${row.tieBreaker1}"/></td>
                        <td><c:out value="${row.tieBreaker2}"/></td>
                        <td><c:out value="${row.poolID}"/></td>
                        <td><c:out value="${row.email}"/></td>
                    </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </body>
</html>