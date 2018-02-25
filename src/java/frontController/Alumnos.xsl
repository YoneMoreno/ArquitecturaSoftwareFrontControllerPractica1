<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet 
    xmlns:xsl=
    "http://www.w3.org/1999/XSL/Transform" 
    version="1.0"
>
    
    <xsl:template match="/">
        <html>
            <head>
                <title>LISTA DE ALUMNOS</title>
            </head>
            <body bgColor="black" text="white">
                <table>
                    <tr>
                        <th colspan="4">Nombre</th>
                        <th colspan="3">Primer apellido</th>
                        <th colspan="3">Segundo apellido</th>
                        <th colspan="2">Asignatura</th>
                        <th colspan="2">Nota</th>
                    </tr>
                    <xsl:apply-templates />
                </table>
            </body>
        </html>
    </xsl:template>
        
    <xsl:template match="table">
        <tr>
            <td colspan="4">
                <xsl:value-of select="firstCell" />
            </td>
            <td colspan="3">
                <xsl:value-of select="secondCell" />
            </td>
            <td colspan="3">
                <xsl:value-of select="thirdCell" />
            </td>
            <td colspan="2">
                <xsl:value-of select="fourthCell" />
            </td>
            <td colspan="2">
                <xsl:value-of select="fifthCell" />
            </td>
        </tr>
    </xsl:template>

    
    <xsl:template match="firstCell">
        <P>
            <B>Nombre: </B>
            <TR>
                <xsl:apply-templates/>
            </TR>
        </P>
    </xsl:template>
    
    <xsl:template match="fourthCell">
        <h1>Aginatura: </h1>
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="fifthCell">
        <h2>Nota: </h2>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:output method="html"/>
    
</xsl:stylesheet>
