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
            <body>
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
        
    <xsl:template match="ALUMNO">
        <tr>
            <td colspan="4">
                <xsl:value-of select="NOMBRE" />
            </td>
            <td colspan="3">
                <xsl:value-of select="APELLIDO1" />
            </td>
            <td colspan="3">
                <xsl:value-of select="APELLIDO2" />
            </td>
            <td colspan="2">
                <xsl:value-of select="ASIGNATURAS/ASIGNATURA" />
            </td>
            <td colspan="2">
                <xsl:value-of select="ASIGNATURAS/NOTA" />
            </td>
        </tr>
    </xsl:template>

    
    <xsl:template match="NOMBRE">
        <P>
            <B>Nombre: </B>
            <TR>
                <xsl:apply-templates/>
            </TR>
        </P>
    </xsl:template>
    
    <xsl:template match="APPELLIDO">
        <P>
            <B>Apellidos: </B>
            <xsl:apply-templates/>
        </P>
    </xsl:template>
    
    <xsl:template match="ASIGNATURA">
        <h1>Aginatura: </h1>
        <xsl:apply-templates/>
    </xsl:template>
    
    <xsl:template match="NOTA">
        <h2>Nota: </h2>
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:output method="html"/>
    
</xsl:stylesheet>
