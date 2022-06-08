// Steven
// 13520131

#include "Expression.hpp"

class SubstractExpression : public BinaryExpression {
public:
    SubstractExpression(Expression *x, Expression *y);
    int solve();
};

