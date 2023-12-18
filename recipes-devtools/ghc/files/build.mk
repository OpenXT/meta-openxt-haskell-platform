SRC_HC_OPTS        = -H64m -O0 -fasm -fPIE
GhcStage1HcOpts    = -O -fasm -fPIE
GhcStage2HcOpts    = -O0 -fasm -fPIE
GhcLibHcOpts       = -O -fasm -fPIE
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
