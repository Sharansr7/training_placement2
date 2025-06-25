import barcode
from barcode.writer import ImageWriter

code = barcode.get("ean13", "123456789012", writer=ImageWriter())
code.save("barcode_output")
