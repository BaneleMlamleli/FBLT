<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>

<div class="container-fluid">
    <div class="row" style="margin-top: 40px; margin-bottom: 40px">
        <div align="center" class="col-md-3">
            <img src="" class="img-responsive img-thumbnail" style="height:800px!important" width="85%" height="800px"/>
        </div>
        <div class="col-md-6">
            <h3 style="color: orange">Item Title</h3>
            <hr/>
            <br/>
            <div class="row">
                <div class="col-md-3">
                    <img src="${item}" class="img-responsive img-thumbnail" style="height:300px!important" width="300px"
                         height="350px"/>
                </div>
                <div class="col-md-2">
                    <button type="button" class="btn btn-success">Add To Cart</button>
                </div>
                <div class="col-md-1"></div>
                <div class="col-md-2"></div>
                <div class="col-md-4"></div>
            </div>
            <h3>Item Description</h3>
            <hr/>
            <br/>
            <div class="row">
                <div class="col-md-12">
                    Currently No Items Available
                </div>
            </div>
            <h3>Item Details</h3>
            <hr/>
            <br/>
            <div class="row">
                <div class="col-md-12">
                    <div style="background-color: lightgray">
                        <p>Category: ${advert_info.get(2)}</p>
                    </div>
                    <div style="background-color: lightgray">
                        <p>Description: ${advert_info.get(0)}</p>
                    </div>
                    <div style="background-color: lightgray">
                        <p>Seller: ${advert_info.get(1)}</p>
                    </div>
                    <div style="background-color: lightgray">
                        <p>Price: ${advert_info.get(3)}</p>
                    </div>
                    <div style="background-color: lightgray">
                        <p>City: ${advert_info.get(4)}</p>
                    </div>
                    <div style="background-color: lightgray">
                        <p>Suburb: ${advert_info.get(5)}</p>
                    </div>
                </div>
            </div>
        </div>
        <div align="center" class="col-md-3">
            <img class="img-responsive img-thumbnail" style="height:800px!important" width="85%" height="800px"/>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp"/>