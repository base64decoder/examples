extern crate base64;
use std::str;

fn main() {
    let bytes = base64::decode("YmFzZTY0IGRlY29kZQ==").unwrap();
    let str = str::from_utf8(&bytes).unwrap();
    println!("{}", str);
}
