<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
    xmlns:xsl=
    "http://www.w3.org/1999/XSL/Transform" 
    version="1.0"
>
    
    <xsl:template match="ALUMNO">
        <HTML>
            <BODY bgcolor="gray">
                <xsl:apply-templates/>
            </BODY>
        </HTML>
    </xsl:template>
    
    <xsl:template match="NOMBRE">
        <P>
            <B>Nombre: </B>
            <xsl:apply-templates/>
        </P>
    </xsl:template>
    
    <xsl:template match="ASIGNATURA">
        <h1>Aginatura: </h1>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:output method="html"/>
    
</xsl:stylesheet>
