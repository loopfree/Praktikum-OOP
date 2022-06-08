// Steven
// 13520131

#include "Expression.hpp"

class NegativeExpression : public UnaryExpression {
public:
    NegativeExpression(Expression *x);
    int solve();
};

