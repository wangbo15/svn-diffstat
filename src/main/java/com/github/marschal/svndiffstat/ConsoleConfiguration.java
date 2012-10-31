package com.github.marschal.svndiffstat;

import java.util.List;

import com.beust.jcommander.Parameter;

public class ConsoleConfiguration {

  @Parameter(names = {"-double", "-d", "-retina", "-r"},
      description = "Render in double the resolution, useful for retina Macs")
  boolean doubleSize = false;

  @Parameter(names = {"-width", "-w"},
      description = "The width of the chart in pixels")
  int width = 1200;

  @Parameter(names = {"-height", "-h"},
      description = "The height of the chart in pixels")
  int height = 600;

  @Parameter(names = {"-max", "-m"},
      description = "Commits with more than this number of lines changed will be ignored.")
  int max = 10000;

  @Parameter(names = {"-author", "-a"},
      description = "The authors that should be analyzed",
      required = true)
  List<String> authors;

  @Parameter(names = {"-extension", "-e"},
      description = "The file extensions that should be analized")
  List<String> extensions;

  @Parameter(names = {"-file", "-f"},
      description = "The file where to save the generated chart",
      required = true)
  String savePath;


}
