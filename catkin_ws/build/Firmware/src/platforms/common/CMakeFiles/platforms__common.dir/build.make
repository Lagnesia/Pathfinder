# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.2

#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:

# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list

# Suppress display of executed commands.
$(VERBOSE).SILENT:

# A target that is always out of date.
cmake_force:
.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/wonsik/catkin_ws/src

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/wonsik/catkin_ws/build

# Include any dependencies generated for this target.
include Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/depend.make

# Include the progress variables for this target.
include Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/progress.make

# Include the compile flags for this target's objects.
include Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/flags.make

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/flags.make
Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o: /home/wonsik/catkin_ws/src/Firmware/src/platforms/common/px4_getopt.c
	$(CMAKE_COMMAND) -E cmake_progress_report /home/wonsik/catkin_ws/build/CMakeFiles $(CMAKE_PROGRESS_1)
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Building C object Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o"
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && /usr/bin/cc  $(C_DEFINES) $(C_FLAGS) -o CMakeFiles/platforms__common.dir/px4_getopt.c.o   -c /home/wonsik/catkin_ws/src/Firmware/src/platforms/common/px4_getopt.c

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/platforms__common.dir/px4_getopt.c.i"
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && /usr/bin/cc  $(C_DEFINES) $(C_FLAGS) -E /home/wonsik/catkin_ws/src/Firmware/src/platforms/common/px4_getopt.c > CMakeFiles/platforms__common.dir/px4_getopt.c.i

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/platforms__common.dir/px4_getopt.c.s"
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && /usr/bin/cc  $(C_DEFINES) $(C_FLAGS) -S /home/wonsik/catkin_ws/src/Firmware/src/platforms/common/px4_getopt.c -o CMakeFiles/platforms__common.dir/px4_getopt.c.s

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.requires:
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.requires

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.provides: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.requires
	$(MAKE) -f Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/build.make Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.provides.build
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.provides

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.provides.build: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o

# Object files for target platforms__common
platforms__common_OBJECTS = \
"CMakeFiles/platforms__common.dir/px4_getopt.c.o"

# External object files for target platforms__common
platforms__common_EXTERNAL_OBJECTS =

/home/wonsik/catkin_ws/devel/lib/libplatforms__common.a: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o
/home/wonsik/catkin_ws/devel/lib/libplatforms__common.a: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/build.make
/home/wonsik/catkin_ws/devel/lib/libplatforms__common.a: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --red --bold "Linking C static library /home/wonsik/catkin_ws/devel/lib/libplatforms__common.a"
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && $(CMAKE_COMMAND) -P CMakeFiles/platforms__common.dir/cmake_clean_target.cmake
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && $(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/platforms__common.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/build: /home/wonsik/catkin_ws/devel/lib/libplatforms__common.a
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/build

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/requires: Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/px4_getopt.c.o.requires
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/requires

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/clean:
	cd /home/wonsik/catkin_ws/build/Firmware/src/platforms/common && $(CMAKE_COMMAND) -P CMakeFiles/platforms__common.dir/cmake_clean.cmake
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/clean

Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/depend:
	cd /home/wonsik/catkin_ws/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/wonsik/catkin_ws/src /home/wonsik/catkin_ws/src/Firmware/src/platforms/common /home/wonsik/catkin_ws/build /home/wonsik/catkin_ws/build/Firmware/src/platforms/common /home/wonsik/catkin_ws/build/Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : Firmware/src/platforms/common/CMakeFiles/platforms__common.dir/depend
