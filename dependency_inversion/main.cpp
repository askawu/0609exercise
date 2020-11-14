#include <vector>
#include <string>
#include <stdint.h>

using namespace std;

class UnrealEngine {
    public:
        UnrealEngine() {}
        ~UnrealEngine() {}

        int drawImage(vector<vector<int>>& bitmap, int x, int y) {
            return 0;
        }
};

class FTPDownloader {
    public:
        FTPDownloader() {}
        ~FTPDownloader() {}
        int get(string url, string dest_path) {
            return 0;
        }
};

class USBStorage {
    public:
        USBStorage() {}
        ~USBStorage() {}
        int write(string name, vector<vector<int>>& bitmap) {
            return 0;
        }
};

class VideoGame {
    private:
        UnrealEngine engine;
        FTPDownloader ftp;
        USBStorage storage; 

    public:
        VideoGame() {}
        ~VideoGame() {}
        int run();
};

int VideoGame::run() {
   
    ftp.get("ftp://10.206.66.181/imgs/cute.png", "/tmp/cute.png");

    // assume we have following 50x50 bitmap by reading cute.png.
    vector<vector<int>> bitmap(50, vector<int>(50));

    engine.drawImage(bitmap, 0, 0);

    storage.write("mybackup.png", bitmap);    

    return 0;
}

int main() {
    VideoGame game;
    game.run();
    return 0;
}
