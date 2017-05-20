#include <iostream>

int main(int argc, char* argv[]) {
    for(int i = 1; i <= 100; i++) {
        std::string result = "";
        if(i % 3 == 0)
            result = "Fizz";
        if(i % 5 == 0)
            result += "Buzz";
        std::cout << (!result.empty() ? result : std::to_string(i)) << std::endl;
    }
    return 0;
}

