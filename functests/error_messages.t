vim: filetype=cram

Test setup:
  $ alias osmosis=$TESTDIR/../package/bin/osmosis

Test for running osmosis:
  $ osmosis -q

error message for invalid input
  $ osmosis blub
  * org.openstreetmap.osmosis.core.Osmosis main (glob)
  SEVERE: Parsing error in position 1 (blub): expected an option (-?) or a task name (--sth)
  [1]

error message for invalid option
  $ osmosis -a
  * org.openstreetmap.osmosis.core.Osmosis main (glob)
  SEVERE: Parsing error in position 1 (-a): unrecognised option
  [1]

error message for too much parameters
  $ osmosis -q 1 2 3
  * org.openstreetmap.osmosis.core.Osmosis main (glob)
  SEVERE: Parsing error in position 1 (): expected argument %s to have no more than one parameter.
  [1]

error message for conversion error
  $ osmosis -q blub
  * org.openstreetmap.osmosis.core.Osmosis main (glob)
  SEVERE: Parsing error in position 2 (): expected argument %d to contain an integer value.
  [1]

error message for missing parameter
  $ osmosis -p
  * org.openstreetmap.osmosis.core.Osmosis main (glob)
  SEVERE: Parsing error in position 1 (): expected argument %d to have one parameter.
  [1]


