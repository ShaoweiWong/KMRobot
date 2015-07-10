all: prepare target end
	

prepare:
	if not exist $(CLASSESFOLDER) mkdir $(CLASSESFOLDER)
	if not exist $(OUTPUTFOLDER) mkdir $(OUTPUTFOLDER)

target: $(OUTPUTFOLDER)\$(TARGETNAME).jar

end:

$(CLASSESFOLDER)/Main.class: $(SOURCEFOLDER)/Main.java
	javac -classpath $(CLASSESFOLDER) -sourcepath $(SOURCEFOLDER) -d $(CLASSESFOLDER) $(SOURCEFOLDER)/Main.java

$(OUTPUTFOLDER)\$(TARGETNAME).jar: $(CLASSESFOLDER)/Main.class
	if exist $(OUTPUTFOLDER)\$(TARGETNAME).jar del $(OUTPUTFOLDER)\$(TARGETNAME).jar
	jar cvfm $(OUTPUTFOLDER)\$(TARGETNAME).jar $(SOURCEFOLDER)\manifest.mf -C $(CLASSESFOLDER) .

clean: 
	del /q /s $(OUTPUTFOLDER)
	del /q /s $(CLASSESFOLDER)
