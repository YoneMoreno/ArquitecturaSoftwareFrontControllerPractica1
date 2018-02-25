
<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
    xmlns:xsl=
    "http://www.w3.org/1999/XSL/Transform" 
    version="1.0"
>
    
    <xsl:template match="ALUMNO">
        <table>
            <xsl:apply-template/>
        </table>
    </xsl:template>
        
    <xsl:template match="NOMBRE">
        <firstCell>
            <xsl:apply-templates/>
        </firstCell>
    </xsl:template>
    
    <xsl:template match="APPELLIDO1">
        <secondCell>
            <xsl:apply-templates/>
        </secondCell>
    </xsl:template>
    
    <xsl:template match="APPELLIDO2">
        <thirdCell>
            <xsl:apply-templates/>
        </thirdCell>
    </xsl:template>
    
    
    <xsl:template match="ASIGNATURA">
        <fourthCell>
            <xsl:apply-templates/>
        </fourthCell>
    </xsl:template>
    
    <xsl:template match="NOTA">
        <fifthCell>
            <xsl:apply-templates/>
        </fifthCell>
    </xsl:template>

    
    
</xsl:stylesheet>

