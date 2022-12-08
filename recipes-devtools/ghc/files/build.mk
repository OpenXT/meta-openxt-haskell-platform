SRC_HC_OPTS        = -H64m -O0 -fasm -optc-no-pie -optl-no-pie -optP-no-pie
GhcStage1HcOpts    = -O -fasm -optc-no-pie -optl-no-pie -optP-no-pie
GhcStage2HcOpts    = -O0 -fasm -optc-no-pie -optl-no-pie -optP-no-pie
GhcLibHcOpts       = -O -fasm
SplitObjs          = NO
HADDOCK_DOCS       = NO
BUILD_DOCBOOK_HTML = NO
BUILD_DOCBOOK_PS   = NO
BUILD_DOCBOOK_PDF  = NO

INTEGER_LIBRARY = integer-gmp

GhcLibWays = v dyn

#Stage1Only = YES

NoFibWays =
STRIP :=
