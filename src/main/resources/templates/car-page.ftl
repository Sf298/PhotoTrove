<div id="header">
    <h2>FreeMarker Spring MVC Hello World</h2>
</div>
<div id="content">

    Hello ${name}
    <br>
    <#list changes as item>
        ${item.id}, ${item.photoId}, ${item.parentId!''}, ${item.type} <br>
    </#list>

</div>